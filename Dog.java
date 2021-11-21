public class Dog {
    String m_color;
    String m_skill;
    int m_age;

    public Dog(int age, String color, String skill){
        this.m_age = age;
        this.m_color = color;
        this.m_skill = skill;
    }

    public void birthday(){
        this.m_age++;
    }


    public void skillThing(){
        if (this.m_skill == "licking" || this.m_skill == "sleeping" || this.m_skill == "guarding" || this.m_skill == "walking" || this.m_skill == "barking" || this.m_skill == "playing"){
            System.out.println("jojo reference");
        }
    }


    public int getM_age() {
        return m_age;
    }
    public void setM_age(int m_age) {
        this.m_age = m_age;
    }


    public String getM_color() {
        return m_color;
    }
    public void setM_color(String m_color) {
        this.m_color = m_color;
    }


    public String getM_skill() {
        return m_skill;
    }
    public void setM_skill(String m_skill) {
        this.m_skill = m_skill;
    }
}
