package base.companies;

public interface OrganizationComparable {

    default int compare(Object obj){
        return 0;
    }
}
