public class Star {
    public static void main (String args[]) {  
        //  Approach: There are 4 general rules for solving a pattern-based question: 

        // (1) We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
        // (2) Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
        // (3) We print the ‘*’ inside the inner loop.
        // (4) Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns.
        

        //              ---patterns---
        // printPattern1(5);

        // printPattern2(5);

        // printPattern3(5);

        // printPattern4(5);

        // printPattern5(5);

        // printPattern6(5);

        // printPattern7(3);

        // printPattern8(5);

        // printPattern9(3);

        // printPattern10(3);
        
        // printPattern11(5);

        // printPattern12(5);

        // printPattern13(5);

        // printPattern14(5);

        // printPattern15(5);

        // printPattern16(5);

        // printPattern17(4);

        // printPattern18(5);

        // printPattern19(6);

        // printPattern20(7);

        printPattern21(7);

        // printPattern22(7);
    };

    //          * * * *
    //          * * * *
    //          * * * *
    public static void printPattern1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            };
            System.out.println();
        };
    };

    //          *
    //          **
    //          ***
    public static void printPattern2(int a) {
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            };
            System.out.println();
        };
    };

    //          1
    //          12
    //          123
    public static void printPattern3(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            };
            System.out.println();
        };
    };

    //          1
    //          22
    //          333
    //          4444
    public static void printPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            };
            System.out.println();
        };
    };

    //          ***
    //          **
    //          *
    public static void printPattern5 (int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("* ");
            };
            System.out.println();
        };
    };

    //          123
    //          12
    //          1
    public static void printPattern6(int n) {
        for(int i=n; i >= 1; i--) {
            for(int j=1; j <= i; j++) {
                System.out.print(j + "  ");
            };
            System.out.println();
        };
    };

    //              *
    //             ***
    //            *****
    public static void printPattern7(int n) {
        for(int i=1; i <= n; i++) {
            //      space =====> j should be =   
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            //      for * ---->   j should in the order of 2*i-1
            for(int j=1; j <= 2*i-1; j++) {
                System.out.print("*");
            };

            //      space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            System.out.println();
        };
    };

    //          *****
    //           ***
    //            *
    public static void printPattern8(int n) {
        for(int i=n; i>=1; i--) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            // star
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            };

            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            System.out.println();
        };
    };

    //            *
    //           *** 
    //          *****
    //          *****
    //           ***
    //            *
    public static void printPattern9(int n){
        // up side 
        for(int i=1; i <= n; i++) {
            // space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            //  star
            for(int j=1; j<=(2*i-1); j++) {
                System.out.print("*");
            };

            for(int j=1; j<=n-1; j++) {
                System.out.print(" ");
            };
            
            System.out.println();
        };

        //      down side
        for(int i=n; i>=1; i--) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            // stars
            for(int j=1; j<=(2*i-1); j++) {
                System.out.print("*");
            };

            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            };

            System.out.println();
        };
    };

    //          *
    //          **
    //          ***
    //          **
    //          *
    public static void printPattern10 (int n) {
        // up side
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            };
            System.out.println();
        };
        //  down side
        for(int i=(n-1); i>=1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            };
            System.out.println();
        };
    };

    //          1
    //          01
    //          101
    //          0101
    public static void printPattern11(int n) {
        // even row -- 0   odd row -- 1  ; row = col
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                //  even num
                if((j+i)%2 == 0) {
                    System.out.print('1');
                } else if((j+i) != 0) {
                    System.out.print('0');
                };
            };
            System.out.println();
        };
    };

    //          1      1
    //          12    21
    //          123  321
    //          12344321
    public static void printPattern12(int n) {
        for(int i=1; i<=n; i++) {
            // left side
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            };
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            };

            //  right side
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            };
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            };
            System.out.println();
        };
    };

    //          1
    //          23
    //          456
    //          78910
    //          1112131415
    public static void printPattern13(int n) {
        int k=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(k);
                k++;
            };
            System.out.println();
        };
    };

    //          a
    //          ab
    //          abc
    //          abcd
    public static void printPattern14(int n) {
        // outer loop for rows
        for(int i=1; i<=n; i++) {
            int charAt = 97;        //  initialized a var for ascii vale of a and others
            //      inner loop for the cols
            for(int j=1; j<=i; j++) {
                char letter = (char) charAt;        // knowing the letter at specific ascii code 

                System.out.print(letter);
                charAt++;
            };
            System.out.println();
        };
    };

    //          abcd
    //          abc
    //          ab
    //          a
    public static void printPattern15(int n) {
        for(int i=n; i>=1; i--) {
            int asciiCode = 97;
            for(int j=1; j<=i; j++) {
                char letter = (char) asciiCode;
                System.out.print(letter);
                asciiCode++;
            };
            System.out.println();
        };
    };


    //          a
    //          bb
    //          ccc
    //          dddd
    //          eeeee
    public static void printPattern16(int n) {
        int ascCode = 97;                   //for first row - 97 = a
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                char letter = (char) ascCode;
                System.out.print(letter);
            };
            ascCode++;                      //inc after each row completed
            System.out.println();
        };
    };

    //              A
    //             ABA
    //            ABCBA
    //           ABCDCBA
    public static void printPattern17(int n) {
        for(int i=1; i<=n; i++) {
            //          left side --- a, ab, abc, abcd
            int x = 65;
            //  spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            };
            //  letters
            for(int k=1; k<=i; k++) {
                char letter = (char) x;
                System.out.print(letter);
                x++;
            };

            //           right side --- _, a, ba, cba
            // letters
            x -= 2;             // adjust the start to the second last letter
            for(int j=1; j<=(i-1); j++) {
                char letter = (char) x;
                System.out.print(letter);
                x--;
            };
            System.out.println();
        };
    };

    //              E
    //              DE
    //              CDE
    //              BCDE
    //              ABCDE
    public static void printPattern18 (int n) {
        for(int i=1; i<=n; i++) {
            int x = 64 + (n - i + 1);
            for(int j=1; j<=i; j++) {
                System.out.print((char) x);
                x++;
            };
            x = 64 + (n - i);
            System.out.println();
        };
    };

    //              ******
    //              **  **
    //              *    *
    //              *    *
    //              **  **
    //              ******
    public static void printPattern19(int n) {
        //  up side
        for(int i=(n/2); i>=1; i--) {
            //      left side
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            };
            // spaces
            for(int sp=1; sp<=(n/2-i); sp++) {
                System.out.print(" ");
            };

            //      right side
            //  spaces
            for(int s=1; s<=(n/2-i); s++) {
                System.out.print(" ");
            };
            // stars
            for(int k=i; k>=1; k--) {
                System.out.print("*");
            };
            System.out.println();
        };
        //  down side
        for(int i=1; i<=(n/2); i++) {
            //          left side
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            };
            //  spaces
            for(int s=1; s<=(n/2-i); s++) {
                System.out.print(" ");
            };
            //          right side
            //  spaces
            for(int s=1; s<=(n/2-i); s++) {
                System.out.print(" ");
            };
            // letters
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            };
            System.out.println();
        };
    };

    //              *      *
    //              **    **
    //              ***  ***
    //              ********
    //              ***  ***
    //              **    **
    //              *      *
    public static void printPattern20(int n) {
        //              upper side
        for(int i=1; i<=(n/2+1); i++) {
            //  left side
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            };
            // spaces
            for(int k=1; k<=(n/2+1-i); k++) {
                System.out.print(" ");
            };

            //  right side
            // spaces
            for(int j=1; j<=(4-i); j++) {
                System.out.print(" ");
            };
            // stars
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            };
            System.out.println();
        };

        //            down side
        for(int i=(n/2); i>=1; i--) {
            //  left side
            // stars
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            };
            // spaces
            for(int k=1; k<=(4-i); k++) {
                System.out.print(" ");
            };

            //  right side
            // spaces
            for(int j=1; j<=(n/2+1-i); j++) {
                System.out.print(" ");
            };
            // stars
            for(int k=i; k>=1; k--) {
                System.out.print("*");
            };
            System.out.println();
        };
        System.out.println();
    };

    //              ******
    //               
    //              *    *
    // 
    //              *    *
    //          
    //              ******
    public static void printPattern21(int n) {
        // for(int i=1; i<=(n-(n/2)); i++) {
        //     for(int j=1; j<=n; j++) {
        //         System.out.print("*");
        //     };
        //     System.out.println();
        //     System.out.println();
        // };
    };

    //              4444444
    //              4333334
    //              4322234
    //              4321234
    //              4322234
    //              4333334
    //              4444444 
    public static void printPattern22(int n) {
        // for(int i=1; i<=(n); i++) {
        //     // left side
        //     for(int j=1; j<=(n/2+1); j++) {
        //         System.out.print((n/2+1));
        //     };
        //     // right side
        //     for(int j=1; j<=(n/2); j++) {
        //         System.out.print(j);
        //     };
        //     System.out.println();
        // };
    };
};
