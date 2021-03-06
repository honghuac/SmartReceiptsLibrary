package co.smartreceipts.android.fragments.preferences;

import co.smartreceipts.android.R;

public class PreferenceHeaderReceiptsFragment extends AbstractPreferenceHeaderFragment {

    @Override
    public int getPreferencesResourceId() {
        return R.xml.preferences_receipts;
    }

    @Override
    public void configurePreferences() {
        mSettingsActivity.configurePreferencesReceipts(this);
    }
}
