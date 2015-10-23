package org.zgif.model.datatype.enumeration;

import java.lang.String;

public class ProjectCostCategory {

private String value;
public ProjectCostCategory (String value) throws java.lang.Exception  {
if(!value.matches("[1-9][0-9]{2}")) {
  throw new Exception("not permitted value '"+value+"' for ProjectCostCategory. pattern: [1-9][0-9]{2}");
}
  this.value = value;}
public String toString () {
return value;}

}