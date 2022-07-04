package pe.com.pd.controller;

import pe.com.pd.dto.ResponseServiceTwoDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-two")
public class ServiceTwoController {

    @GetMapping("/operation201")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationOne() {
        return getResponse(201, "S2-Op01", "Service two - Operation one");
    }

    @GetMapping("/operation202")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationTwo() {
        return getResponse(202,"S2-Op02", "Service two - Operation two");
    }

    @GetMapping("/operation203")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationThree() {
        return getResponse(203, "S2-Op03", "Service two - Operation three");
    }

    @GetMapping("/operation204")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationFour() {
        return getResponse(204, "S2-Op04", "Service two - Operation four");
    }

    @GetMapping("/operation205")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationFive() {
        return getResponse(205, "S2-Op05", "Service two - Operation five");
    }

    @GetMapping("/operation206")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationSix() {
        return getResponse(206, "S2-Op06", "Service two - Operation six");
    }

    @GetMapping("/operation207")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationSeven() {
        return getResponse(207, "S2-Op07", "Service two - Operation seven");
    }

    @GetMapping("/operation208")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationEight() {
        return getResponse(208, "S2-Op08", "Service two - Operation eight");
    }

    @GetMapping("/operation209")
    public ResponseEntity<ResponseServiceTwoDTO> getResponseServiceTwoOperationNine() {
        return getResponse(209, "S2-Op09", "Service two - Operation nine");
    }

    private ResponseEntity<ResponseServiceTwoDTO> getResponse(int id, String name, String description) {
        var response = ResponseServiceTwoDTO
                .builder()
                .id(id)
                .name(name)
                .description(description)
                .build();

        return ResponseEntity.ok(response);
    }
}
