package main.java.java.a.beginners.guide.chapter06.p255;

class LocalClassDemo {
    public static void main(String[] args) {

        class ShowBits {
            int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;

                mask <<= numbits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");

                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        ShowBits byteval = new ShowBits(8);

        for (byte b = 0; b < 10; b++) {
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }

    }

}
