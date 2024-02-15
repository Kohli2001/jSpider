package org.jsp.merchantbootapp.service;

import java.util.List;
import java.util.Optional;

import org.jsp.merchantbootapp.dao.MerchantDao;
import org.jsp.merchantbootapp.dto.Merchant;
import org.jsp.merchantbootapp.dto.ResponseStructure;
import org.jsp.merchantbootapp.exceptions.MerchantNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class MerchantService {

	@Autowired
	private MerchantDao dao ;
	
	public ResponseStructure<Merchant> saveMerchant( Merchant merchant) {
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		structure.setMessage("Merchant Saved Successfully! ");
		structure.setData(dao.saveMerchant(merchant));
		structure.setStatusCode(HttpStatus.CREATED.value());
		return structure;
	}

	
	public ResponseEntity<ResponseStructure<Merchant>> updateMerchant( Merchant merchant) {
		Optional<Merchant> resMerchant = dao.findById(merchant.getId());
		ResponseStructure<Merchant> structure = new ResponseStructure<>();

		if (resMerchant.isPresent()) {
			Merchant dbMerchant = new Merchant();
			dbMerchant.setId(merchant.getId());
			dbMerchant.setName(merchant.getName());
			dbMerchant.setEmail(merchant.getEmail());
			dbMerchant.setPhone(merchant.getPhone());
			dbMerchant.setPassword(merchant.getPassword());
			dbMerchant.setGst_number(merchant.getGst_number());
			structure.setMessage("Merchant Updated Successfully..!");
			structure.setData(dao.saveMerchant(dbMerchant));
			structure.setStatusCode(HttpStatus.ACCEPTED.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.ACCEPTED);
		}
		throw new MerchantNotFound("Invalid Merchant Id");
	
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Merchant>> findById(@PathVariable(name = "id") int id) {
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		Optional<Merchant> resMerchant = dao.findById(id);
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Found");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.ACCEPTED.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.ACCEPTED);
		}
		throw new MerchantNotFound("Invalid Merchant ID");
	}

	
	public ResponseEntity<ResponseStructure<String>> deleteById( int id) {
		Optional<Merchant> resMerchant = dao.findById(id);
		ResponseStructure<String> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Found");
			structure.setData("Merchant Deleted !");
			structure.setStatusCode(HttpStatus.OK.value());
			dao.delete(id);
			return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.OK);
		}
		structure.setMessage("Merchant Not Found");
		structure.setData("Can't delete merchant as id is Invalid");
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}

	
	public ResponseStructure<List<Merchant>> findAll() {
		ResponseStructure<List<Merchant>> structure = new ResponseStructure<>();
		structure.setMessage("List of Merchants");
		structure.setData(dao.findAll());
		structure.setStatusCode(HttpStatus.OK.value());
		return structure;
	}

	
	public ResponseEntity<ResponseStructure<Merchant>> verify( long phone,  String password) {
		Optional<Merchant> resMerchant = dao.verify(phone, password);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Verified Successfully ! with phone and password ");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid phone or Password");
	}

	public ResponseEntity<ResponseStructure<Merchant>> verify( String email,
			@RequestParam String password) {
		Optional<Merchant> resMerchant = dao.verify(email, password);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Verified Successfully ! with Email and password ");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid Email or Password");

	}

	public ResponseEntity<ResponseStructure<List<Merchant>>> findByName( String name) {
		ResponseStructure<List<Merchant>> structure = new ResponseStructure<>();
		List<Merchant> resMerchant = dao.findByName(name);
		if (resMerchant.size() > 0) {
			structure.setMessage("Merchant Founds with Given Name");
			structure.setData(dao.findByName(name));
			structure.setStatusCode(HttpStatus.ACCEPTED.value());
			return new ResponseEntity<ResponseStructure<List<Merchant>>>(structure, HttpStatus.ACCEPTED);
		}

		throw new MerchantNotFound("Invalid Merchant Name");
	}

	public ResponseEntity<ResponseStructure<Merchant>> findByPhone( long phone) {
		Optional<Merchant> resMerchant = dao.findByPhone(phone);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Found");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid Phone Number");
	}

	public ResponseEntity<ResponseStructure<Merchant>> findByEmail( String email) {
		Optional<Merchant> resMerchant = dao.findByEmail(email);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Found");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid Email Id");
	}


	public ResponseEntity<ResponseStructure<Merchant>> verifyById( int id,  String password) {
		Optional<Merchant> resMerchant = dao.verify(id, password);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Verified Successfully ! with Id and password ");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid Merchant Id or Password");
	}

	public ResponseEntity<ResponseStructure<Merchant>> verifyByGst(String gst,
			 String password) {
		Optional<Merchant> resMerchant = dao.verifyByGst(gst, password);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Verified Successfully ! with Gst Number and password ");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid Merchant Gst Number or Password");
	}

	public ResponseEntity<ResponseStructure<Merchant>> findByGst(String gst) {
		Optional<Merchant> resMerchant = dao.findByGst(gst);
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		if (resMerchant.isPresent()) {
			structure.setMessage("Merchant Found");
			structure.setData(resMerchant.get());
			structure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.OK);
		}
		throw new MerchantNotFound("Invalid GST Number");
	}
}
