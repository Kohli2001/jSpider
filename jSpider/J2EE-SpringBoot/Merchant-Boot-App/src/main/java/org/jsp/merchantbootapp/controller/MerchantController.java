package org.jsp.merchantbootapp.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.merchantbootapp.dto.Merchant;
import org.jsp.merchantbootapp.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/merchants")
public class MerchantController {

	@Autowired
	private MerchantRepository repository;

	@PostMapping
	public Merchant saveMerchant(@RequestBody Merchant merchant) {
		return repository.save(merchant);
	}

	@PutMapping
	public Merchant updateMerchant(@RequestBody Merchant merchant) {
		return repository.save(merchant);
	}

	@GetMapping("/{id}")
	public Merchant findById(@PathVariable(name = "id") int id) {
		Optional<Merchant> resMerchant = repository.findById(id);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable(name = "id") int id) {
		Optional<Merchant> resMerchant = repository.findById(id);
		if (resMerchant.isPresent()) {
			repository.delete(resMerchant.get());
			return "Merchant Deleted !";
		}
		return "Can't Delete! Due to: Invalid Id";
	}

	@GetMapping
	public List<Merchant> findAll() {
		return repository.findAll();

	}

	@PostMapping("/verify-by-phone")
	public Merchant verify(@RequestParam long phone, @RequestParam String password) {
		Optional<Merchant> resMerchant = repository.verify(phone, password);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

	@PostMapping("/verify-by-email")
	public Merchant verify(@RequestParam String email, @RequestParam String password) {
		Optional<Merchant> resMerchant = repository.verify(email, password);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;

	}

	@GetMapping("/find-by-name/{name}")
	public List<Merchant> findByName(@PathVariable(name = "name") String name) {
		return repository.findByName(name);
	}

	@GetMapping("/find-by-phone/{phone}")
	public Merchant findByPhone(@PathVariable(name = "phone") long phone) {
		Optional<Merchant> resMerchant = repository.findByPhone(phone);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

	@GetMapping("/find-by-email/{email}")
	public Merchant findByEmail(@RequestParam(name = "email") String email) {
		Optional<Merchant> resMerchant = repository.findByEmail(email);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

	@PostMapping("/verify-by-id")
	public Merchant verifyById(@RequestParam int id, @RequestParam String password) {
		Optional<Merchant> resMerchant = repository.verify(id, password);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

	@PostMapping("/verify-by-gst")
	public Merchant verifyByGst(@RequestParam(name="gst_number") String gst, @RequestParam String password) {
		Optional<Merchant> resMerchant = repository.verifyByGst(gst, password);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

	@GetMapping("/find-by-gst")
	public Merchant findByGst(@RequestParam(name = "gst_number") String gst) {
		Optional<Merchant> resMerchant = repository.findByGst(gst);
		if (resMerchant.isPresent()) {
			return resMerchant.get();
		}
		return null;
	}

}
