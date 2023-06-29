package pwAssiment.Array.aasi2;

public class canPlacedFlower {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0 ;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0 ){

                boolean checkLeft = (i == 0 ) || (flowerbed[i-1] == 0 );
                boolean chekRight = (i == flowerbed.length -1 ) || (flowerbed[i+1] == 0);

                // if my  both of the condation IsCorrect
                if (checkLeft && chekRight){
                    flowerbed[i] = 1;
                    count++ ;
                }
                if (count >= n) return  true ;

            }

        }
        return count >= n ;
    }




    public boolean canPlaceFlowers1(int[] flowerbed, int n) {

        for (int i = 0; i < n; i++) {
            if (isplaced(flowerbed)) return  true ;

        }
        return false ;

    }
    static  boolean isplaced(int[] flower){
        for (int i = 1; i < flower.length ; i++) {
            if(flower[i-1] == 0 && flower[i+1] == 0 ){
                flower[i] = 1 ;
                return true ;
            }

        }
        return false ;
    }
}
