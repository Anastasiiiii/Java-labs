public class lab4 {
    public static void main(String [] args) {
            class Furniture {
                String name;     //назва
                String materials;   //матеріал, з якого зроблене
                String recognition;  //призначення
                int price;    //ціна
                int serialNumber; //сирійний номер

                int amountOfOrders; //кількість замовлень

                public Furniture(String name, String materials, String recognition, int price, int serialNumber, int amountOfOrders) {
                    this.name = name;
                    this.materials = materials;
                    this.recognition = recognition;
                    this.price = price;
                    this.serialNumber = serialNumber;
                    this.amountOfOrders = amountOfOrders;
                }

                public int getPrice() {
                    return price;
                }

                public int getAmountOfOrders() {
                    return amountOfOrders;
                }
            }

            Furniture[] furniture = {
                    new Furniture("Sofa", "jacquard", "living room", 3475, 36485957, 4),
                    new Furniture("table", "wood", "dining room", 1532, 28373890, 26),
                    new Furniture("chair", "wood", "dining room", 345, 23464798, 10),
                    new Furniture("bed", "MDF", "bedroom", 5328, 47585950, 6),
                    new Furniture("wardrobe", "wood and glass", "bedroom", 2816, 37484940, 7)
            };

        System.out.println();

        for (int i = 0; i < furniture.length; i++) {
            System.out.println( "Назва:" + " " + furniture[i].name + " " + "|" +
                    "Матеріали:" + " " + furniture[i].materials + " " + "|" +
                    "Призначення:" + " " + furniture[i].recognition + " " + "|" +
                    "Ціна:" + " " + furniture[i].price + " " + "|" +
                    "Серійний номер:" + " " + furniture[i].serialNumber + " " + "|" +
                    "Кількість замовлень:" + " " + furniture[i].amountOfOrders);
        }
        
        System.out.println();
        
        Arrays.sort(furniture, Comparator.comparingInt(Furniture::getPrice));
        for(int i = 0; i < furniture.length; i++) {
            System.out.println( "Назва:" + " " + furniture[i].name + " " + "|" +
                    "Матеріали:" + " " + furniture[i].materials + " " + "|" +
                    "Призначення:" + " " + furniture[i].recognition + " " + "|" +
                    "Ціна:" + " " + furniture[i].price + " " + "|" +
                    "Серійний номер:" + " " + furniture[i].serialNumber + " " + "|" +
                    "Кількість замовлень:" + " " + furniture[i].amountOfOrders);
        }
        
        Arrays.sort(furniture, Comparator.comparing(Furniture::getAmountOfOrders).reversed());
        for(int i = 0; i < furniture.length; i++) {
            System.out.println( "Назва:" + " " + furniture[i].name + " " + "|" +
                    "Матеріали:" + " " + furniture[i].materials + " " + "|" +
                    "Призначення:" + " " + furniture[i].recognition + " " + "|" +
                    "Ціна:" + " " + furniture[i].price + " " + "|" +
                    "Серійний номер:" + " " + furniture[i].serialNumber + " " + "|" +
                    "Кількість замовлень:" + " " + furniture[i].amountOfOrders);
        }
    }
}
