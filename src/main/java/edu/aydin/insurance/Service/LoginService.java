package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.ServiceDto;
import edu.aydin.insurance.Entites.UserAccount;
import edu.aydin.insurance.Repository.ServiceRepository;
import edu.aydin.insurance.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class LoginService {

    @Autowired
    private UserAccountRepository userAccountRepository;
    @Autowired
    private ServiceRepository serviceRepository;


    public ServiceDto login(String username, String password){

        UserAccount userAccount = userAccountRepository.findByUsernameAndPassword(username,password).get();
        if(userAccount==null){
            System.out.println("user account not found!");
        }else{
            System.out.println("user account found!");
        }

        edu.aydin.insurance.Entites.Service service = serviceRepository.findById(userAccount.getService().getId()).get();

        return new ServiceDto(service.getId(),
                service.getServiceName(),
                service.getServicePhone(),
                service.getVKN(),
                service.getVD(),
                service.getServiceAddress(),
                service.getServiceEmail());
    }


}
