public class lab3 {

        public static void main(String[] args) {

            StringBuilder text = new StringBuilder(
                            "Ні долі, ні волі у мене нема.\n"
                            + "Зосталася тільки надія одна.\n"
                            + "Надія вернутись ще раз на Вкраїну.\n"
                            + "Поглянути ще раз на рідну країну.\n"
                            + "Поглянути ще раз на синій Дніпро.\n"
                            + "Там жити чи вмерти, мені все одно.\n"
                            + "Поглянути ще раз на степ, могилки.\n"
                            + "Востаннє згадати палкії гадки.\n"
                            + "Ні долі, ні волі у мене нема.\n"
                            + "Зосталася тільки надія одна.\n");
            System.out.println(text + "\n");
            String subStr [] = text.toString().split("[.!?]");
            
            for (int i = 0; i <= subStr.length - 1; i++) {
                System.out.println("Слова, що були у речені:");
                int t = 0;
                String w[] = subStr[i].toString().trim().split(" ");
                for (int j = 0; j <= w.length - 1; j++) {
                    t++;
                    System.out.println(w[j]);
                }
                System.out.println("Кількість слів у даному речені: " + t);
                System.out.println();

            }


        }
    }

