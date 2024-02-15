package org.jsp.merchantbootapp.controller;

import java.util.List;

import org.jsp.merchantbootapp.dto.Merchant;
import org.jsp.merchantbootapp.dto.ResponseStructure;
import org.jsp.merchantbootapp.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/merchants")
public class MerchantController {

	@Autowired
	private MerchantService service;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED, reason = "Something went wrong! ")
	public ResponseStructure<Merchant> saveMerchant(@RequestBody Merchant merchant) {
		return service.saveMerchant(merchant);
	}

	@PutMapping
	public ResponseEntity<ResponseStructure<Merchant>> updateMerchant(@RequestBody Merchant merchant) {
		return service.updateMerchant(merchant);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Merchant>> findById(@PathVariable(name = "id") int id) {
		return service.findById(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteById(@PathVariable(name = "id") int id) {
		return service.deleteById(id);
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseStructure<List<Merchant>> findAll() {
		return service.findAll();
	}

	@PostMapping("/verify-by-phone")
	public ResponseEntity<ResponseStructure<Merchant>> verify(@RequestParam long phone, @RequestParam String password) {
		return service.verify(phone, password);
	}

	@PostMapping("/verify-by-email")
	public ResponseEntity<ResponseStructure<Merchant>> verify(@RequestParam String email,
			@RequestParam String password) {
		return service.verify(email, password);
	}

	@GetMapping("/find-by-name/{name}")
	public ResponseEntity<ResponseStructure<List<Merchant>>> findByName(@PathVariable(name = "name") String name) {
		return service.findByName(name);
	}

	@GetMapping("/find-by-phone/{phone}")
	public ResponseEntity<ResponseStructure<Merchant>> findByPhone(@PathVariable(name = "phone") long phone) {
		return service.findByPhone(phone);
	}

	@GetMapping("/find-by-email/{email}")
	public ResponseEntity<ResponseStructure<Merchant>> findByEmail(@RequestParam(name = "email") String email) {
		return service.findByEmail(email);
	}

	@PostMapping("/verify-by-id")
	public ResponseEntity<ResponseStructure<Merchant>> verifyById(@RequestParam int id, @RequestParam String password) {
		return service.verifyById(id, password);
	}

	@PostMapping("/verify-by-gst")
	public ResponseEntity<ResponseStructure<Merchant>> verifyByGst(@RequestParam(name = "gst_number") String gst,
			@RequestParam String password) {
		return service.verifyByGst(gst, password);
	}

	@GetMapping("/find-by-gst")
	public ResponseEntity<ResponseStructure<Merchant>> findByGst(@RequestParam(name = "gst_number") String gst) {
		
		return service.findByGst(gst);
	}

}
