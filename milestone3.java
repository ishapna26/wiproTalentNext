int n = input1.length();
ArrayList<Integer> num = new ArrayList<>();
int firstNum = input1.charAt(0) - '0';
int sum = firstNum;

for (int i = 1; i < n; i++) {
    int no = input1.charAt(i) - '0';
    // use current sum's parity
    if (sum % 2 != 0) {
        sum += no;
        if (sum % 2 == 0) {
            num.add(sum);
            // move start to next digit (keeps your original style)
            if (i + 1 < n) {
                sum = input1.charAt(i + 1) - '0';
                i++; // consume that next digit as the new start
            }
        }
    } else {
        sum += no; // FIX: was sum += sum;
        if (sum % 2 != 0) {
            num.add(sum);
            if (i + 1 < n) {
                sum = input1.charAt(i + 1) - '0';
                i++;
            }
        }
    }
}

// --- NEW: ensure the last leftover group is included ---
if (num.isEmpty() || num.get(num.size() - 1) != sum) {
    num.add(sum);
}

StringBuilder res = new StringBuilder();
for (int j : num) {
    res.append(j);
}
int out = Integer.parseInt(res.toString());
return out;
