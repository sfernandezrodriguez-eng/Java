public class ejemplosArray {

    public static void main (String [] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        char[] letras = new char[10];
        letras[0] = 'a';
        letras[1] = 'b';
        for (int i = 0; i < 5; i++) {
            System.out.println("O numero é: " + numeros[i]);
        }
        Persoa[] equipo;
        equipo = new Persoa[5];
        equipo[0] = new Persoa("Ramon","4567U",23);
        equipo[1] = new Persoa("Jose","8642H",32);
        equipo[2] = new Persoa("Carmen","9776Y",41);
        equipo[3] = new Persoa("Tina","1234R",16);
        equipo[4] = new Persoa("Pili","3258T",33);
        int cositas = 0;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            cont = cont + 1;
            System.out.println(cont);
            cositas = cositas + equipo[i].edade;
        }
        System.out.println(cositas/cont);
        int h = 0;
        Persoa dniMenor = equipo[0];
        for (int i = 1; i < equipo.length; i++) {
            if (dniMenor.dni.compareTo(equipo[i].dni)>0) {
                dniMenor = equipo[i];



        }}




    }
}
