package uz.pdp.clients.myCollection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.clients.dto.CollectionDto;

import java.util.List;

@FeignClient("myCollection")
public interface MyCollectionClient {
    @GetMapping("api/myCollection")
    List<CollectionDto>getMyCollection();
}
