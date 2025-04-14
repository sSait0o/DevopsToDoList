@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUserId(Long userId);
}