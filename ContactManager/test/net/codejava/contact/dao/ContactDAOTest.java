package net.codejava.contact.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dao = new ContactDAOImpl(dataSource);
	}

	@Test
	void testSave() {
		Contact contact = new Contact("Nguyen Van Duc", "Ha Noi, Viet Nam", "cong.nv.bita@gmail.com", "0904547863");
		int result = dao.save(contact);
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(5, "Nguyen Van Quyen", "Ha Noi, Viet Nam", "cong.nv.bita@gmail.com",
				"0904547863");
		int result = dao.update(contact);
		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 5;
		Contact contact = dao.get(id);
		if (contact != null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 5;
		Integer result = dao.delete(id);
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> listContacts = dao.list();
		for(Contact contact : listContacts) {
			System.out.println(contact);
		}
		assertTrue(!listContacts.isEmpty());
	}

}
