package AimsProject;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered <= MAX_NUMBERS_ORDERED){
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc with name " + disc.getTitle() + " has been added");
        }
        else {
            System.out.println("The cart is almost full");
        }  
    }
    public void totalCost(){
        float sum = 0;
        for (int i = 0 ; i < qtyOrdered ; i++){
            System.out.println(itemOrdered[i].getId() + "\t" + itemOrdered[i].getTitle() + "\t" + itemOrdered[i].getCost());
            sum += itemOrdered[i].getCost();
        }
        System.out.println("Total cost : " + sum);
    }

    int index = -1;
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0 ; i < qtyOrdered ; i++){
            if (itemOrdered[i].equals(disc)){
                index = i;
            }
        }
        if ( index == -1 ){
            System.out.println("Not found DVD in cart");
            return;
        }
        DigitalVideoDisc newArray[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        System.arraycopy(itemOrdered, 0 , newArray, 0 , index);
        System.arraycopy(itemOrdered, index+1 , newArray, index, qtyOrdered - index - 1);
        itemOrdered = newArray;
        qtyOrdered --;
        System.out.println("The disc has been removed");
    }

    //Truyền tham số theo mảng biến số (variable arguments array)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
        for (int i = 0 ; i < dvdList.length ; i++){
            this.addDigitalVideoDisc(dvdList[i]);
        }
    }

    // Truyền tham số là mảng
    // public void addDigitalVideoDisc(DigitalVideoDisc[] list){
    //     for (int i = 0 ; i < list.length ; i++){
    //         this.addDigitalVideoDisc(list[i]);
    //     }
    // }

    // Truyền tham số khác với các hàm trên
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }
}
