package entities;

public class User {
  private Long id;
  private String name;
  private String username;
  private String curso;
  
  public Long getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  public String getUsername() {
    return this.username;
  }
  public String getCurso() {
    return this.curso;
  }

  public void setId(Long id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public void setCurso(String curso) {
   this.curso = curso;
  }

  public static User createMyUser(){
    User user = new User();
    user.id = 1l;
    user.name = "My Name";
    user.username = "my-user-name";
    return user;
  }
  
  public User() {}

  public User(Long id, String name, String username, String curso) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.curso = curso;
  }

}


