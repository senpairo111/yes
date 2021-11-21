public class Cat {
    private String m_color;
    private int m_age;


    public Cat(int age, String color){
        this.m_age = age;
        this.m_color = color;
    }


    public void birthday(){
        this.m_age++;
        if (this.m_age > 13){
            this.m_color = String.format("color is now %s with a few whites", this.m_color);
            if (this.m_age > 18){
                System.out.println("wow, old cat!");
            }
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
    

}
