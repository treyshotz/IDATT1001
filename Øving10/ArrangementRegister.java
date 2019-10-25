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
    
    public Arrangement findArrOneDate(long date) {
        for(int i = 0; i < this.Arrangementer.size(); i++) {
            if(Arrangementer.get(i).getDate() == date) {
                toStringm(this.Arrangementer.get(i));
            }
        }
        System.out.println("Could not find");
        return null;
    }

    public Arrangement findArrTwoDate(long date1, long date2) {
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
                toStringm(this.Arrangementer.get(i));

            }
        }
        System.out.println("Could not find it");
        return null;
    }

    public Arrangement findArrName(String name) {
        for(int i = 0; i < this.Arrangementer.size(); i++) {
            if(Arrangementer.get(i).getName().equals(name)) {
                toStringm(this.Arrangementer.get(i));
            }
        }
        return null;
    }

    public Arrangement findArrPlace(String name) {
        for(int i = 0; i < this.Arrangementer.size(); i++) {
            if(Arrangementer.get(i).getPlace().equals(name)) {
                toStringm(this.Arrangementer.get(i));
            }
        }
        System.out.println("Could not find the place");
        return null;
    }

    public Arrangement listByDate() {
        for(int i = 0; i < this.Arrangementer.size(); i++) {
            long smallest = this.Arrangementer.get(0).getDate();
            int id = 0;
                for(int j = 0; j < this.Arrangementer.size(); j++) {
                    if(Arrangementer.get(j).getDate() < smallest) {
                        smallest = Arrangementer.get(j).getDate();
                        id = j;
                    }
                }
                toStringm(Arrangementer.get(id));
                this.Arrangementer.remove(id);
            }
        return null;
    }

   

    public void toStringm(Arrangement s) {
        System.out.println("\nNavn: " + s.getName() + "\nID: " + s.getId() + 
        "\nPlass: " +  s.getPlace() + "\nType: " +  s.getType() + "\nDato: " + s.getDate());
    }
    

}