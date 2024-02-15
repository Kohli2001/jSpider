package org.jsp.merchantbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.merchantbootapp.dto.Merchant;
import org.jsp.merchantbootapp.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {

	@Autowired
	private MerchantRepository repository;

	public Merchant saveMerchant(Merchant m) {
		return repository.save(m);

	}

	public Optional<Merchant> findById(int id) {
		return repository.findById(id);
	}

	public List<Merchant> findByName(String name) {
		return repository.findByName(name);
	}

	public Optional<Merchant> findByGst(String gst) {
		return repository.findByGst(gst);
	}

	public Optional<Merchant> findByPhone(long phone) {
		return repository.findByPhone(phone);
	}

	public Optional<Merchant> findByEmail(String email) {
		return repository.findByEmail(email);
	}

	public Optional<Merchant> verify(String email, String password) {
		return repository.verify(email, password);
	}

	public Optional<Merchant> verify(long phone, String password) {
		return repository.verify(phone, password);
	}

	public Optional<Merchant> verify(int id, String password) {
		return repository.verify(id, password);
	}

	public Optional<Merchant> verifyByGst(String gst, String password) {
		return repository.verifyByGst(gst, password);
	}

	public List<Merchant> findAll() {
		return repository.findAll();
	}

	public boolean delete(int id) {

		Optional<Merchant> recMerchant = findById(id);
		if (recMerchant.isPresent()) {
			repository.delete(recMerchant.get());
			return true;
		}
		return false;
	}
}
