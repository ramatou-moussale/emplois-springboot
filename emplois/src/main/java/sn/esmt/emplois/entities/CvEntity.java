package sn.esmt.emplois.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class CvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 100, nullable = false)
    private String prenom;
    private int age;
    @Column(length = 100, nullable = false)
    private String adresse;
    @Column(length = 200, nullable = false, unique = true)
    private String email;
    @Column(length = 100, nullable = false)

    private String telephone;
    @Column(length = 200, nullable = false)
    private String specialite;
    @Column(length = 100, nullable = false)
    private String niveauEtude;
    @Column(length = 150, nullable = false)
    private  String experienceProfessionnelle;
}
