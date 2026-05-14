void main() {

    ArrayList<Futbolista> equipo = new ArrayList<>();
    Futbolista f1 = new Futbolista("Dalo GZ", "1553AA",19,2);
    Futbolista f2 = new Futbolista("Aaronux_025", "1023AA",69,0);
    Futbolista f3 = new Futbolista("Noel-Fr", "1123AA",17,3);
    equipo.add(f1);
    equipo.add(f2);
    equipo.add(f3);
    /*for (int i=0;i<equipo.size();i++) {
        System.out.println(equipo.get(i));
    }

    Iterator<Futbolista> it = equipo.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }*/

    ListIterator<Futbolista> litr = equipo.listIterator();
    while (litr.hasNext()) {
        System.out.println( litr.next());
    }
    while (litr.hasPrevious()) {
        System.out.println(litr.previous());
    }

}
