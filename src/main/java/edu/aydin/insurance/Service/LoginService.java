package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.ServiceIncDto;
import edu.aydin.insurance.Entites.ServiceInc;
import edu.aydin.insurance.Entites.UserAccount;
import edu.aydin.insurance.Repository.ServiceIncRepository;
import edu.aydin.insurance.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class LoginService {

    @Autowired
    private UserAccountRepository userAccountRepository;
    @Autowired
    private ServiceIncRepository serviceIncRepository;


    public ServiceIncDto login(String username, String password){

        UserAccount userAccount = userAccountRepository.findByUsernameAndPassword(username,password).get();
        if(userAccount==null){
            System.out.println("user account not found!");
        }else{
            System.out.println("user account found!");
        }

        ServiceInc serviceInc = serviceIncRepository.findById(userAccount.getService().getId()).get();

        return new ServiceIncDto(serviceInc.getId(),
                serviceInc.getServiceName(),
                serviceInc.getServicePhone(),
                serviceInc.getVKN(),
                serviceInc.getVD(),
                serviceInc.getServiceAddress(),
                serviceInc.getServiceEmail());
    }


}
