package com.cidadera.trabalhofinal.negocio.entidades;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;

import static com.cidadera.trabalhofinal.negocio.entidades.enums.CategoriaReclamacaoEnum.AGUA;
import static com.cidadera.trabalhofinal.negocio.entidades.enums.StatusReclamacaoEnum.ABERTA;
import static java.awt.geom.Path2D.contains;
import static java.lang.Long.parseLong;
import static java.time.LocalDate.of;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class ReclamacaoTest {

    @Test
    void getId() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoId = new Reclamacao();
        final Field field = reclamacaoId.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(reclamacaoId, parseLong("01010101"));

        final Long result = reclamacaoId.getId();

        assertEquals(result,  parseLong("01010101"));
    }

    @Test
    void setId() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoId = new Reclamacao();

        reclamacaoId.setId(parseLong("01010101"));

        final Field field = reclamacaoId.getClass().getDeclaredField("id");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoId), parseLong("01010101"));
    }

    @Test
    void getTitle() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoTitle = new Reclamacao();
        final Field field = reclamacaoTitle.getClass().getDeclaredField("title");
        field.setAccessible(true);
        field.set(reclamacaoTitle, "Not a title");

        final String result = reclamacaoTitle.getTitle();

        assertEquals(result,  "Not a title");
    }

    @Test
    void setTitle() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoTitle = new Reclamacao();

        reclamacaoTitle.setTitle("Not a Title");

        final Field field = reclamacaoTitle.getClass().getDeclaredField("title");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoTitle), "Not a Title");
    }

    @Test
    void getDescription() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoDescription = new Reclamacao();
        final Field field = reclamacaoDescription.getClass().getDeclaredField("description");
        field.setAccessible(true);
        field.set(reclamacaoDescription, "Not a description");

        final String result = reclamacaoDescription.getDescription();

        assertEquals(result, "Not a description");
    }

    @Test
    void setDescription() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoDescription = new Reclamacao();

        reclamacaoDescription.setDescription("Not a Description");

        final Field field = reclamacaoDescription.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoDescription), "Not a Description");
    }

    @Test
    void getDate() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoDate = new Reclamacao();
        final Field field = reclamacaoDate.getClass().getDeclaredField("date");
        field.setAccessible(true);
        field.set(reclamacaoDate, of(1990, 12, 31));

        final LocalDate result = reclamacaoDate.getDate();

        assertEquals(result, of(1990, 12, 31));
    }

    @Test
    void setDate() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoDate = new Reclamacao();

        reclamacaoDate.setDate(of(1990, 12, 31));

        final Field field = reclamacaoDate.getClass().getDeclaredField("date");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoDate), of(1990, 12, 31));
    }

    @Test
    void getNeighborhood() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoNeighborhood = new Reclamacao();
        final Field field = reclamacaoNeighborhood.getClass().getDeclaredField("neighborhood");
        field.setAccessible(true);
        field.set(reclamacaoNeighborhood, "Hollywood");

        final String result = reclamacaoNeighborhood.getNeighborhood();

        assertEquals(result,  "Hollywood");
    }

    @Test
    void setNeighborhood() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoNeighborhood = new Reclamacao();

        reclamacaoNeighborhood.setNeighborhood("Hollywood");

        final Field field = reclamacaoNeighborhood.getClass().getDeclaredField("neighborhood");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoNeighborhood), "Hollywood");
    }

    @Test
    void getStreet() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoStreet = new Reclamacao();
        final Field field = reclamacaoStreet.getClass().getDeclaredField("street");
        field.setAccessible(true);
        field.set(reclamacaoStreet, "Azenha");

        final String result = reclamacaoStreet.getStreet();

        assertEquals(result,  "Azenha");
    }

    @Test
    void setStreet() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoStreet = new Reclamacao();

        reclamacaoStreet.setStreet("Azenha");

        final Field field = reclamacaoStreet.getClass().getDeclaredField("street");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoStreet), "Azenha");
    }

    @Test
    void getCategory() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoCategory = new Reclamacao();
        final Field field = reclamacaoCategory.getClass().getDeclaredField("category");
        field.setAccessible(true);
        field.set(reclamacaoCategory, AGUA);

        final Enum result = reclamacaoCategory.getCategory();

        assertEquals(result,  AGUA);
    }

    @Test
    void setCategory() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoCategory = new Reclamacao();

        reclamacaoCategory.setCategory(AGUA);

        final Field field = reclamacaoCategory.getClass().getDeclaredField("category");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoCategory), AGUA);
    }

    @Test
    void getImageLink() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoImage = new Reclamacao();
        final Field field = reclamacaoImage.getClass().getDeclaredField("imageLink");
        field.setAccessible(true);
        field.set(reclamacaoImage, "https://www.google.com.br");

        final String result = reclamacaoImage.getImageLink();

        assertEquals(result,  "https://www.google.com.br");
    }

    @Test
    void setImageLink() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoImage = new Reclamacao();

        reclamacaoImage.setImageLink("https://www.google.com.br");

        final Field field = reclamacaoImage.getClass().getDeclaredField("imageLink");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoImage), "https://www.google.com.br");
    }

    @Test
    void getIssueStatus() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoStatus = new Reclamacao();
        final Field field = reclamacaoStatus.getClass().getDeclaredField("issueStatus");
        field.setAccessible(true);
        field.set(reclamacaoStatus, ABERTA);

        final Enum result = reclamacaoStatus.getIssueStatus();

        assertEquals(result,  ABERTA);
    }

    @Test
    void setIssueStatus() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoStatus = new Reclamacao();

        reclamacaoStatus.setIssueStatus(ABERTA);

        final Field field = reclamacaoStatus.getClass().getDeclaredField("issueStatus");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoStatus), ABERTA);
    }

    @Test
    void getComment() throws  NoSuchFieldException, IllegalAccessException {
        final Reclamacao reclamacaoComment = new Reclamacao();

        final List result = reclamacaoComment.getComments();

        assertEquals(result,  null);
    }

    @Test
    void setComment() throws  NoSuchFieldException, IllegalAccessException{
        final Reclamacao reclamacaoComment = new Reclamacao();

        reclamacaoComment.setComments(null);

        final Field field = reclamacaoComment.getClass().getDeclaredField("comments");
        field.setAccessible(true);
        assertEquals(field.get(reclamacaoComment), null);
    }
}