public class lab3 {

        public static void main(String[] args) {

            StringBuilder text = new StringBuilder(
                           " Нарцис вузьколистий росте в Україні лише на Закарпатті. Долина нарцисів – унікальна природна пам’ятка в урочищі Креші поблизу міста Хуст. Це єдине місце в Східній Європі, де існують природні зарості цієї білосніжної квітки. Схожі, але менші за площею популяції є ще в таких місцях: Альпах, Румунії, деяких країнах на Балканах. Науковці вважають, що багато тисячоліть тому, рятуючись від льодовика, квіти переселилися в хустську долину. Про це місце люди переповідають багато легенд. Одна з них є переспівом давньогрецького міфу про Нарциса");
            
                
            System.out.println(text + "\n");
            String subStr [] = text.toString().split("[.!?]");
            
            int arr[] = new int[subStr.length];
            int arr2[] = new int[subStr.length];    
            
            for (int i = 0; i <= subStr.length - 1; i++) {
                System.out.println("Слова, що були у речені:");
                int wordsCounter = 0;
                String w[] = subStr[i].toString().trim().split(" ");
                for (int j = 0; j <= w.length - 1; j++) {
                    wordsCounter++;
                    System.out.println(w[j]);
                }
                arr[i] = wordsCounter;
                arr2[i] = wordsCounter;
                System.out.println("Кількість слів у даному речені: " + wordsCounter);
                System.out.println();

            }
             
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }

