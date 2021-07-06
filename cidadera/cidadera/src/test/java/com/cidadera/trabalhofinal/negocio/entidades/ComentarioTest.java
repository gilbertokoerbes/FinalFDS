package com.cidadera.trabalhofinal.negocio.entidades;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static java.lang.Long.parseLong;
import static org.junit.jupiter.api.Assertions.*;

class ComentarioTest {

    @Test
    void getId() throws NoSuchFieldException, IllegalAccessException{
        final Comentario idcommentget = new Comentario();
        final Field field = idcommentget.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(idcommentget, parseLong("01010101"));

        final Long result = idcommentget.getId();

        assertEquals(result,  parseLong("01010101"));
        //assertEquals(result,  10L);

    }

    @Test
    void setId() throws NoSuchFieldException, IllegalAccessException{
        final Comentario idcommentset = new Comentario();

        idcommentset.setId(parseLong("01010101"));

        final Field field = idcommentset.getClass().getDeclaredField("id");
        field.setAccessible(true);
        assertEquals(field.get(idcommentset), parseLong("01010101"));

    }

    @Test
    void getComment() throws NoSuchFieldException, IllegalAccessException{
        final Comentario idcommentget = new Comentario();
        final Field field = idcommentget.getClass().getDeclaredField("comment");
        field.setAccessible(true);
        field.set(idcommentget, "Olá mundo");

        final String result = idcommentget.getComment();

        assertEquals(result,  "Olá mundo");
    }

    @Test
    void setComment() throws NoSuchFieldException, IllegalAccessException{
        final Comentario idcommentset = new Comentario();

        idcommentset.setComment("Olá mundo");

        final Field field = idcommentset.getClass().getDeclaredField("comment");
        field.setAccessible(true);
        assertEquals(field.get(idcommentset), "Olá mundo");
    }

    @Test
    void getImage() throws NoSuchFieldException, IllegalAccessException{
            final Comentario imageget = new Comentario();
            final Field field = imageget.getClass().getDeclaredField("image");
            field.setAccessible(true);
            field.set(imageget, "https://www.google.com");

            final String result = imageget.getImage();

            assertEquals(result,  "https://www.google.com");
    }

    @Test
    void setImage() throws NoSuchFieldException, IllegalAccessException{
        final Comentario imageset = new Comentario();

        imageset.setImage("https://www.google.com");

        final Field field = imageset.getClass().getDeclaredField("image");
        field.setAccessible(true);
        assertEquals(field.get(imageset), "https://www.google.com");
    }

    @Test
    void getIssue() throws NoSuchFieldException, IllegalAccessException{
        final Comentario comentarioIssue = new Comentario();
        final Reclamacao commentReclamacaoInside = new Reclamacao();
        final Field field = comentarioIssue.getClass().getDeclaredField("issue");
        field.setAccessible(true);
        field.set(comentarioIssue, commentReclamacaoInside);

        final Reclamacao result = comentarioIssue.getIssue();

        assertEquals(result, commentReclamacaoInside);
    }

    @Test
    void setIssue() throws NoSuchFieldException, IllegalAccessException{
        final Comentario comentarioIssue = new Comentario();
        final Reclamacao commentReclamacaoInside = new Reclamacao();

        comentarioIssue.setIssue(commentReclamacaoInside);

        final Field field = comentarioIssue.getClass().getDeclaredField("issue");
        field.setAccessible(true);
        assertEquals(field.get(comentarioIssue), commentReclamacaoInside);
    }
}