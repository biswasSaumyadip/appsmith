package com.appsmith.server.domains.ce;

import com.appsmith.external.models.Policy;
import com.appsmith.external.views.Views;
import com.appsmith.server.constants.ArtifactType;
import com.appsmith.server.domains.GitArtifactMetadata;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.Set;

public interface ArtifactCE {

    String getId();

    @JsonView(Views.Internal.class)
    default String getBaseId() {
        return getId();
    }

    String getName();

    String getWorkspaceId();

    Boolean getExportWithConfiguration();

    void setExportWithConfiguration(Boolean bool);

    GitArtifactMetadata getGitArtifactMetadata();

    void setGitArtifactMetadata(GitArtifactMetadata gitArtifactMetadata);

    String getUnpublishedThemeId();

    String getPublishedThemeId();

    void makePristine();

    void sanitiseToExportDBObject();

    void setUnpublishedThemeId(String themeId);

    void setPublishedThemeId(String themeId);

    Set<Policy> getPolicies();

    ArtifactType getArtifactType();
}
