package ch.zhaw.gpi.veka;

import ch.zhaw.gpi.veka.controller.CardController;
import ch.zhaw.gpi.veka.entities.CardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author scep
 */
@Component
public class TempCommandLineRunner implements CommandLineRunner {
    
    @Autowired
    private CardController cardController;

    @Override
    public void run(String... args) throws Exception {
        CardEntity cardEntity = cardController.getCard(360269466985268L);
        
        System.out.println(cardEntity.getInsuredPerson().getFirstName());
    }
    
}
