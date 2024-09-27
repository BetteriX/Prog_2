public class Main {
    public static void main(String[] args) {
        // A Math osztályt nem kell meghívni
        //int result = Math.max(7, 3);

        //System.out.println(MyUtils.duplaz(6));
        //System.out.println(MyUtils.strlen("aabb"));

        //int[] scores = new int[5];
        //for (int i = 0; i < scores.length; i++) {
        //    System.out.println(scores[i]);
        //}

        int[] szamok = { 74, 56, 34, 57, 4, 6, 5 };
        kiir(szamok);

        MyUtils.reverse(szamok);
        kiir(szamok);
    }

    static void kiir(int[] szamok){
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + ", ");
        }

        System.out.println();
    }
}
