package Employee.Management.System.Util;

import org.springframework.stereotype.Component;
import Employee.Management.System.Model.EmployeeDTO;
import Employee.Management.System.entities.Employee;
import org.springframework.beans.BeanUtils;
@Component
public class Converter {
    public Employee convertToEmployeeEntity(EmployeeDTO employeeDTO)
    {
        Employee employee=new Employee();
        if(employeeDTO!=null)
        {
            BeanUtils.copyProperties(employeeDTO, employee);
        }
        return employee;
    }

    //convert from entity to DTO

    public EmployeeDTO convertToEmployeeDTO(Employee employee)
    {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        if(employee!=null)
        {
            BeanUtils.copyProperties(employee, employeeDTO);
        }
        return employeeDTO;
    }
}
