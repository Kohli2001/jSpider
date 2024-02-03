package org.jsp.hibernatetemp.dao;

import javax.transaction.Transactional;

import org.jsp.hibernatetemp.dto.Merchnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MerchantDao {

		@Autowired
		private HibernateTemplate template;

		@Transactional
		public Merchnat saveMerchant(Merchnat p) {
			template.save(p);
			return p;
		}
	

		public Merchnat findById(int id) {
			return template.get(Merchnat.class, id);

		}

		@Transactional
		public boolean deleteMerchant(int id) {
			Merchnat p = template.get(Merchnat.class, id);
			if (p != null) {
				template.delete(p);
				return true;
			}
			return false;
		}

		public HibernateTemplate getTemplate() {
			return template;
		}

		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}
		
	}

