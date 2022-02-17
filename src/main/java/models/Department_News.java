package models;

public class Department_News extends News{
    private final String news_type;
    private final int department_id;


    public Department_News(String title, String description,int department_id, int user_id) {
        super(title, description, user_id);
        this.department_id = department_id;
        this.news_type= "department";
    }

    @Override
    public String getNews_type() {

        return news_type;
    }

    @Override
    public byte getDepartment_id() {

        return (byte) department_id;
    }
}
