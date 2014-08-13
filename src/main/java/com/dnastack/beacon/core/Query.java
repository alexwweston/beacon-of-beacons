/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dnastack.beacon.core;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generalized beacon query representation.
 *
 * @author Miroslav Cupak (mirocupak@gmail.com)
 * @version 1.0
 */
@XmlRootElement
public class Query implements Serializable {

    private static final long serialVersionUID = 3L;

    private String chromosome = null;
    private Long position = 0L;
    private String allele = null;

    public Query() {
    }

    public Query(String chromosome, long position, String allele) {
        this.chromosome = chromosome;
        this.position = position;
        this.allele = allele;
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getAllele() {
        return allele;
    }

    public void setAllele(String allele) {
        this.allele = allele;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.chromosome);
        hash = 89 * hash + Objects.hashCode(this.position);
        hash = 89 * hash + Objects.hashCode(this.allele);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Query other = (Query) obj;
        if (!Objects.equals(this.chromosome, other.chromosome)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (!Objects.equals(this.allele, other.allele)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Query{" + "chromosome=" + chromosome + ", position=" + position + ", allele=" + allele + '}';
    }

}