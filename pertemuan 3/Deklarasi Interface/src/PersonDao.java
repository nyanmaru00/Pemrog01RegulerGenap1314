//created by: yanu darmawan
//data		: 06 April 2014

public interface PersonDao{
	void save (Person p);
	void delete(Person p);
	Person getById(Long id);
}
