package fooddeliveryservice.service;

import fooddeliveryservice.domain.*;
import java.util.List;
import java.util.Optional;

public interface RiderService {
    List<Rider> getAllRiders() throws Exception;
    Optional<Rider> getRiderById(Long id) throws Exception;
    Rider createRider(Rider rider) throws Exception;
    Rider updateRider(Rider rider) throws Exception;
    void deleteRider(Long id) throws Exception;

    Rider pickUpFood(PickUpFoodCommand pickUpFoodCommand) throws Exception;
    Rider completeDelivery(CompleteDeliveryCommand completeDeliveryCommand)
        throws Exception;
}
