package models;

public abstract class News {
    private int id;
    private String description;
    private String departmentid;

    public News(String name, String departmentid, int user_id){

        this.departmentid = departmentid;
        this.description = name;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String name) {
        this.description = name;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public abstract String getNews_type();

    public byte getDepartment_id() {
        return 0;
    }

    public byte getUser_id() {
        return 0;
    }
}