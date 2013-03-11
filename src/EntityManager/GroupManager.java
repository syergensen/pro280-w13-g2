package EntityManager;

import Entity.Group;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
@LocalBean
public class GroupManager {

	@PersistenceContext
	private EntityManager em;

	public Group getGroup(String groupname) {
		TypedQuery<Group> query = em.createNamedQuery(Group.GROUP_BY_GROUP_NAME_QUERY, Group.class);
		query.setParameter("name", groupname);
		List<Group> groups = query.getResultList();
		if(groups != null && groups.size() != 0)
			return groups.get(0);
		return null;
	}

	public void saveGroup(Group group) {
		em.persist(group);
	}
}
