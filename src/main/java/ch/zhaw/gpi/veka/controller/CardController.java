package ch.zhaw.gpi.veka.controller;

import ch.zhaw.gpi.veka.entities.CardEntity;
import ch.zhaw.gpi.veka.repositories.CardRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Geschäftslogik im Zusammenhang mit Versichertenkarten
 * 
 * @author scep
 */
@Component
public class CardController {
    
    // Verdrahten der CardRepository
    @Autowired
    private CardRepository cardRepository;
    
    /**
     * Zu einer Kartennummer eine Karte oder null zurück geben
     * 
     * @param cardNumber    Kartennummer
     * @return              CardEntity oder null
     */
    public CardEntity getCard(Long cardNumber){
        // Zur Kartennummer passende Karte suchen
        Optional<CardEntity> card = cardRepository.findById(cardNumber);
        
        // Falls Karte gefunden wurde, dann card zurück geben
        if(card.isPresent()) {
            return card.get();
        } else {
            // Ansonsten null zurückgeben
            return null;
        }        
    }
}
