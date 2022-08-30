package isakayabasi.manytomanyproject.pojos;

import isakayabasi.manytomanyproject.entity.CourseContents;
import java.util.Set;

public class CourseRequest {

    public int id;

    public String coursename;

    public Set<CourseContents> courseContents;
}
