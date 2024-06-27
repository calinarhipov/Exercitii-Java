package ex7;

import java.util.Objects;

/*
* Clasa = este o schita generala a unui obiect/prototip/concept
* 	-> tipul clasei : obiect/entitate/model
*
* Instanta clasei este obiectul.
*
* this = este un POINTER la instanta curenta a atributului clasei
*
* override/overload
*
* */
public class Employee {

    // Atribute = reprezinta caracteristicile generale ale instantei clasei Employee
    private int id;
    private String name;
    private double salary;

    // Constructori = reprezinta un mecanism de definitie a obiectelor unde putem folosi partial sau complet atributele
    // #1 Constructor default
    	// 1. nu are nicium parametru/argument
    	// 2. daca nu este scris, va fi creat in mod automat in faza de compilare
    	// 3. scopul este de a oferi niste informatii STANDARDIZATE
    	// 4. putem sa avem empty body sau sa oferim niste valori simple atributelor pe post de placeholder
    	// 5. PUTEM AVEA UNUL SINGUR
    public Employee() {
		this.id = -1;
        this.name = "EMPLOYEE_NAME";
        this.salary = 0.0;
    }

    // #2 Constructor cu parametri
    	// 1. putem avea minim un parametru
    	// 2. putem avea o infinitate de constructori
    public Employee(int id, String name, double newSalary) {
        this.id = id;
        this.name = name;
        salary = newSalary;
    }


    // Metode comportamentale -> FUNCTIONALITATILE CLASEI
	/* nu reiese din enuntul problemei */

    // Metode getter/setter
    /* semnatura oricarui getter -> public TIPUL_DE_DATE_AL_ATRIBUTULUI get<ATRIBUT> () { return this.<ATRIBUT>; } */
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    /* semnatura oricarui setter -> public void set<ATRIBUT> (TIPUL_DE_DATE_AL_ATRIBUTULUI <parametruCaraus>) { this.<ATRIBUT> = <parametruCaraus> } */
    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Metode suprascrise (optinala) => In momentul in care suprascriem o astfel de metoda, avem libertatea de a ii altera forma dupa considerentele noastre.
    // ToString = este o metoda care se activeaza in momentul in care dorim sa printam la consola OBIECTE
    	// -> adica folosim metode din System.out (print, printf, println...)
    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", salary = " + salary +
                "}";
    }

    // equals = este o metoda care ne permite sa stabilim regula de comparatie prin egalitate (==) intre 2 obiecte
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName());
    }

    // hashCode = implementeaza conceptul de HASHING
    	// -> doua obiecte sunt egale daca au si hash code-urile egale
    	// -> ajuta la efectuarea operatiilor prin functii hash in cadrul structurilor de date hash: HashSet, HashMap, HashTable etc..
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary());
    }
}
