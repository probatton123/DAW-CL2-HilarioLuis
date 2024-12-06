package pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.entity;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryPk {
    private Integer film_id;
    private Integer category_id;
}