package sample.web.ui.mvc;

import java.util.concurrent.atomic.AtomicReference;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckIndicator implements HealthIndicator {
	private final AtomicReference<Health> health = new AtomicReference<>(Health.up().build());

	@Override
	public Health health() {
		return health.get();
	}

	@GetMapping
	public Health get() {
		return health.get();
	}

	@PutMapping("/up")
	public void up() {
		this.health.set(Health.up().build());
	}

	@PutMapping("/down")
	public void down() {
		this.health.set(Health.down().build());
	}
}
