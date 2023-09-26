/* (C)2023 */
package com.shevliakov.superquest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "story_1")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Setter
@Getter
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NonNull
    @Column(name = "dialog")
    String dialog;

    @NonNull
    @Column(name = "options")
    String options;

    @NonNull
    @Column(name = "correct_option")
    String correctOption;

    @NonNull
    @Column(name = "correct_option_dialog")
    int correctOptionDialog;

    @NonNull
    @Column(name = "wrong_option_dialog")
    int wrongOptionDialog;

    @NonNull
    @Column(name = "image_id")
    int imageId;

    @NonNull
    @Column(name = "wrong_end")
    boolean wrongEnd;
}
