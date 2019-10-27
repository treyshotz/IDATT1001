import java.util.*;

class ArrangementRegister {

    private ArrayList<Arrangement> Arrangementer;

    public ArrangementRegister(ArrayList<Arrangement> Arrangementer) {
        this.Arrangementer = new ArrayList<>(Arrangementer);
    }

    public int antRegArr() {
        return Arrangementer.size();
    }

    public boolean regNewArr(Arrangement s) {
        return this.Arrangementer.add(s);
    }
    
    public ArrayList findArrOneDate(long date) {
        ArrayList<Arrangement> list = new ArrayList<>();

        int id = 0;
        for(int i = 0; i < this.Arrangementer.size(); i++) {
            if(Arrangementer.get(i).getDate() == date) {
                list.add(this.Arrangementer.get(i));
            }
        }
        System.out.println("Could not find");
        return list;
    }

    public ArrayList findArrTwoDate(long date1, long date2) {
        ArrayList<Arrangement> list = new ArrayList<>();

        long smallest;
        long biggest;
        for(int i=0; i < this.Arrangementer.size(); i++) {
            if(date1 > date2) {
                biggest = date1;
                smallest = date2;
            }
            else {
                biggest = date2;
                smallest = date1;
            }
            if(Arrangementer.get(i).getDate() > smallest && Arrangementer.get(i).getDate() < biggest) {
                list.add(this.Arrangementer.get(i));

            }
        }
        return list;
    }

    public ArrayList findArrName(String name) {
        ArrayList<Arrangement> list = new ArrayList<>();

        for(int i = 0; i < this.Arrangementer.size(); i++) {
            if(Arrangementer.get(i).getName().equals(name)) {
                list.add(this.Arrangementer.get(i));
            }
        }
        return list;
    }

    public ArrayList findArrPlace(String name) {
        ArrayList<Arrangement> list = new ArrayList<>();
        for(int i = 0; i < this.Arrangementer.size(); i++) {
            if(Arrangementer.get(i).getPlace().equals(name)) {
                list.add(this.Arrangementer.get(i));
            }
        }
        System.out.println("Could not find the place");
        return list;
    }

    /*public Arrangement listByDate() {
        ArrayList<Arrangement> sort = new ArrayList<>(Arrangementer);
        for(int i = 0; i < 3; i++) {
            System.out.println(sort.size());
            long smallest = sort.get(0).getDate();
            int id = 0;
                for(int j = 0; j < sort.size(); j++) {
                    if(sort.get(j).getDate() < smallest) {
                        smallest = sort.get(j).getDate();
                        id = j;
                        System.out.println("ID :" + id);
                    }
                }
            return (Arrangementer.get(id));
            sort.remove(id);
            }
        return null;
    }*/

   

    public String toString() {
        String text = "";
        for(Arrangement a : Arrangementer) {
            text+=a.toString()+"\n";
        }
        return text;
    }
    

}