package com.adnansadiq.cryptoking;
// Text to Binary is Encryption

public class encode {
    public static String enc(String s) {
        String initializer = "11111111";
        int ct = 0;

        int a[] = new int[11111111];
        for (int i = 0; i < s.length(); i++) {

            a[i] = (int) s.charAt(i);
            ct++;
        }

        String res = "";
        int bin[] = new int[111];
        int idx = 0;
        for (int ii = 0; ii < ct; ii++) {
            int temp = a[ii];
            for (int j = 0; j < ct; j++)
                bin[j] = 0; // In the Inner loop we are checking for the binary values
            idx = 0;
            while (temp > 0) {
                bin[idx++] = temp % 2;
                temp = temp / 2; // We are getting temp value from the outer loop itself
            }

            String dig="";
            String temps;
            for(int j =0; j<7;j++) {
                temps = Integer.toString(bin[j]);
                dig=dig.concat(temps);
            }
            // create another var temps
            // temps != temp

            String rev = "";
            for (int j = dig.length() - 1; j >= 0; j--){
                char ca = dig.charAt(j);
                rev = rev.concat(String.valueOf(ca));
            }

            res = res.concat(rev);
        }
        res = initializer.concat(res);
        return res;
    }
}

