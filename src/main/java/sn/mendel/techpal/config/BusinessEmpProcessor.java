package sn.mendel.techpal.config;
import org.springframework.batch.item.ItemProcessor;
import sn.mendel.techpal.entities.BusinessEmp;

public class BusinessEmpProcessor implements ItemProcessor<BusinessEmp,BusinessEmp>{

    @Override
    public BusinessEmp process(BusinessEmp businessEmp) throws Exception {
        if ( businessEmp.getSeries_reference() != null /*&& businessEmp.getSuppressed() != ""
                && businessEmp.getStatus()!= ""*/) {
            return businessEmp;
        }else {
            return null;
        }

    }
}
