package lk.tech.fourteen.set.custom.v2;

// DTO клас
class EmployeeDTO
//        implements Comparable<EmployeeDTO>
{

    int id;
    String name;
    int salary;

    public EmployeeDTO(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // сортування
//    @Override
//    public int compareTo(EmployeeDTO other) {
//
//        // спочатку по зарплаті
//        int salaryCompare = Integer.compare(this.salary, other.salary);
//
//        if (salaryCompare != 0) {
//            return salaryCompare;
//        }
//
//        // якщо зарплати однакові — по id
//        return Integer.compare(this.id, other.id);
//    }

    @Override
    public String toString() {
        return "EmployeeDTO{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}