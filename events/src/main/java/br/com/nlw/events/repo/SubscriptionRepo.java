package br.com.nlw.events.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.nlw.events.dto.SubscriptionRankingItem;
import br.com.nlw.events.model.Event;
import br.com.nlw.events.model.Subscription;
import br.com.nlw.events.model.User;

public interface SubscriptionRepo extends CrudRepository<Subscription, Integer>{
	public Subscription findByEventAndSubscriber(Event evt, User user);
	
	@Query
	public List<SubscriptionRankingItem> generateRanking();
}
