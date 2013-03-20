package Entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/18/13
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "program_options")
public class Program {

    @Id
    @Column(name = "program_name")
    private String programName;

    @Column(name = "starting_salary")
    private Integer startingSalary;

    public String getProgramName() {
        return programName;
    }

    public Integer getStartingSalary(){
        return startingSalary;
    }

}
