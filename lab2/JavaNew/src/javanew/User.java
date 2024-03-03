package javanew;


class User {
    public User(String name,String surname,int birthYeari){
        this.name=name;
        this.surname=surname;
        this.birthYear=birthYeari;
    }
    private String name;
    private String surname;
    private int birthYear;

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setSurname(String s){
        this.surname=s;
    }
    public void setBirthYear(int y){
        this.birthYear=y;
    }

    @Override
    public String toString(){
        return this.name+" "+this.surname+" "+getBirthYear() +"г.";
    }
}
